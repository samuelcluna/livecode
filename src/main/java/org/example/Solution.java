package org.example;

public class Solution {

    public void ordenaStrings(String[] strings){
        if(strings != null && strings.length > 1) {
            for (int i = 0; i < strings.length; i++) {
                int j = i;
                while (j > 0 && strings[j].compareTo(strings[j - 1]) < 0) {
                    swap(strings, j, j - 1);
                    j--;
                }
            }
        }
    }

    private void swap(String[] values, int i, int j){
        String aux = values[i];
        values[i] = values[j];
        values[j] = aux;
    }
}
