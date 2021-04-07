package com.company;

public class Main
{
    public static void main (String[] args)
    {
        int[] observations = {1, 2, 3, 4};
        int[] frequencies = {7, 4, 11, 9};
        double[] relFreqs = new double[4];

        int count = 0;
        boolean out = false;
        for (int i = 0; i <= frequencies.length && !out; i++)
        {
            count += frequencies[i];
            if (count > frequencies.length)
                out = true;
        }


        for (int i = 0; i < frequencies.length; i++)
        {
            double val = ((double)frequencies [i] / count);
            relFreqs [i] = val;
        }

        for (int i = 0; i < observations.length; i++)
            System.out.println (observations [i] + ": " + relFreqs [i]);
    }
}
