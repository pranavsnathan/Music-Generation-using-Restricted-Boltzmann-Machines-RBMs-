package userinterface.GradStudent;
//import org.apache.commons.lang3.*;
import userinterface.Newbie.*;
import org.apache.commons.math3.linear.*;
import org.apache.commons.math3.stat.StatUtils;

import javax.swing.*;
import java.util.*;
import static jdk.nashorn.internal.objects.NativeMath.max;


public class NeuralNetwork {

    public double[][] xor_in = {
            {1,0},
            {0,1}
                };
    public double[] xor_out = { 1,0 };

    /*public double[][] or_in = {
            {1,0},
            {0,1}
            
    };
    public double[] or_out = { 1,0};*/

    public int bias_value = 1;
    public double learning_rate = 0.1;
    public int num_iterations = 1000;
    public static double score=0;
    public RealMatrix input_weights;//n x m matrix of weights for inpyut layer
    public RealVector hidden_layer_weights;// n x 1 number of weights for input layer
    public RealVector hidden_layer_nodes;

    public static void main(String[] args) {

        NeuralNetwork nn = new NeuralNetwork();
        //Can be changed to 'or' or 'xor'
        double[][] input = nn.xor_in;
        double[] output = nn.xor_out;

        nn.fit( input, output );//Training the algorithm

        nn.predict( input,output);//Lets see how we did
        
    }

    public static double activate(double sum){
        return Math.tanh(sum);
    }

    
    
    public static double derivative_activate(double value){
        return 1.0 - Math.pow(value, 2);
    }

    //Append a column of ones for biasing to our input matrix
    public static RealMatrix addBiasToColumn(RealMatrix matrix, double bias_value){
        int num_rows = matrix.getRowDimension();
        int num_columns = matrix.getColumnDimension();

        double[] bias = new double[num_rows];//Create array based on number of rows
        Arrays.fill(bias, bias_value);//Fill it with our bias value

        //Copy matrix and bias column into new_arr
        double[][] new_arr = Arrays.copyOf(matrix.transpose().getData(), num_columns  + 1);
        new_arr[num_columns] = bias;

        return MatrixUtils.createRealMatrix( new_arr ).transpose();

    }

    //Create and fill random Apache Common RandomVector of weights
    public static RealVector createRandomVector(int length){
        Random generator = new Random();
        double[] arr =  new double[length];

        for(int i=0; i<length; i++) {
            arr[i] = generator.nextDouble();
        }
        return MatrixUtils.createRealVector(arr);
    }

    //Create row x column matrix of random values
    public static RealMatrix createRandomMatrix(int row, int column){
        Random generator = new Random();
        double[][] arr =  new double[row][column];

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                arr[i][j] = generator.nextDouble();
            }
        }
        return MatrixUtils.createRealMatrix(arr);
    }

    //Sample Prediction of our input so we can so we performed
    public void predict(double[][] input, double[] output){
        
        //Lets turn the input into a matrix for easier indexing
        RealMatrix mat = MatrixUtils.createRealMatrix(input);

        //Lets add a bias column to it
        RealMatrix mat_bias = addBiasToColumn(mat, this.bias_value);
         
        //Lets cycle through each input row and train our network
        for(int i=0; i<mat.getRowDimension(); i++){
            RealVector vec = mat_bias.getRowVector(i);
            System.out.println("Input " + mat.getRowVector(i) + " -> Actual: " + output[i] +
                " - Predicted : " + this.feedforward(vec, this.hidden_layer_nodes));
          
            score = score + this.feedforward(vec, this.hidden_layer_nodes);
            System.out.println("The utility score of the model is " +score);
            //JOptionPane.showMessageDialog(null,"The score of the model is "+score);
            
            
        }

        }

    public void fit(double[][] input, double[] output){
        //Lets turn our input into a matrix
        double err=0;
        RealMatrix mat = MatrixUtils.createRealMatrix(input);

        //Lets turn the output into a vector
        RealVector vec = MatrixUtils.createRealVector(output);
        RealMatrix matrix_bias = addBiasToColumn(mat, this.bias_value);

        //Lets create hidden nodes
        int num_rows = matrix_bias.getRowDimension();
        int num_columns = matrix_bias.getColumnDimension();
        this.hidden_layer_nodes = createRandomVector( num_rows );

        //Lets create our input and hidden layer weights
        this.input_weights = createRandomMatrix(num_rows, num_columns);
        this.hidden_layer_weights = createRandomVector(num_rows );


        for(int i=0; i< this.num_iterations; i++){
            for(int j=0; j< num_rows; j++) {
                RealVector row_input = matrix_bias.getRowVector(j);

                //Calculate the guess of our 'feedforward' summation algorithm
                double guess = this.feedforward(row_input, this.hidden_layer_nodes),
                       correct = output[j],
                       error = correct - guess;

                //Now lets backpropagate to find out the error
                this.backpropagate(row_input, guess, error);

                //Lets print out the error to see if its decreasing along the way
                {
                    
                    System.out.println("Error(Input " + j + "): " + 0.5 * Math.pow(error,2));
                    
                    //err = err + 0.5 * Math.pow(error,2);
                                   
                            }
                

            }
        }
        //System.out.println("Utility score of the model is " +err);
    }

    public double feedforward(RealVector input, RealVector hidden_nodes){
        //Step 1: Multiply the input weights by the inputs, then store them in each hidden node
        for(int i=0; i<hidden_nodes.getDimension(); i++ ){
            double sum = StatUtils.sum(this.input_weights.getRowVector(i).ebeMultiply(input).toArray());
            hidden_nodes.setEntry( i, activate(sum) );
        }

        double guess = 0, total = 0;

        //Step 2: Lets multiply the hidden nodes weights to the hidden weight inputs
        total += StatUtils.sum( this.hidden_layer_weights.ebeMultiply(hidden_nodes).toArray());

        //Now we take the hyperbolic tangent to cap it between -1 and 1 for our guess
        guess =activate(total);

        return guess;
    }

    public void backpropagate(RealVector input, double guess, double error){

        double[] delta_hidden_nodes =new double[this.hidden_layer_nodes.getDimension()];

        //Step 1: Lets get the error of our guess
        double delta_output =  error * derivative_activate(guess);

        //Step 2: Adjust weights for hidden layer -> output
        RealVector factor = this.hidden_layer_nodes.mapMultiply(this.learning_rate * delta_output);
        this.hidden_layer_weights = this.hidden_layer_weights.add(factor);

        //Step 3:  Lets get the hidden layer errors
        for(int i=0; i<this.hidden_layer_nodes.getDimension(); i++){
            double out = this.hidden_layer_nodes.getEntry(i),
                   val =  derivative_activate(out)*delta_output*this.hidden_layer_weights.getEntry(i);
            delta_hidden_nodes[i] = val;

        }

        //Step 4: Lets change the weights going into the hidden layer
        for(int i=0; i<this.input_weights.getRowDimension(); i++){
            for(int j=0; j<this.input_weights.getColumnDimension(); j++){
                double current_value = this.input_weights.getEntry(i, j);
                double new_value = this.learning_rate*input.getEntry(j)*delta_hidden_nodes[i] + current_value;

                this.input_weights.setEntry(i,j, new_value );
            }
        }


    }



}
