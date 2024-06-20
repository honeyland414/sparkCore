package org.example;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkEnv
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        SparkConf sparkConf = new SparkConf();
        sparkConf.setMaster("local");
        sparkConf.setAppName("test01");

        JavaSparkContext jsc = new JavaSparkContext(sparkConf);

        jsc.close();

    }
}
