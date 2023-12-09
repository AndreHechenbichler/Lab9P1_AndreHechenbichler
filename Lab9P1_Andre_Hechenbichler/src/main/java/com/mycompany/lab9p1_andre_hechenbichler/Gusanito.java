/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9p1_andre_hechenbichler;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author andre
 */
public class Gusanito {
    static Random rand=new Random();
    
    public static char [][] tablero(int anch, int larg){
        int serp1=rand.nextInt(anch-0);
        int serp2=rand.nextInt(larg-0);
        int man1=rand.nextInt(anch-0);
        int man2=rand.nextInt(larg-0);
        
        char[][]temp=new char[anch][larg];
        for(int i=0; i<anch;i++){
            for(int j=0;j<larg;j++){
                    temp[i][j]=' ';
            }
        }
        temp[serp1][serp2]='S';
        temp[man1][man2]='O';
        int cant=0;
        if(larg>anch){
            cant=rand.nextInt((larg-anch)+1)+anch;
        }else if(anch>larg){
            cant=rand.nextInt((anch-larg)+1)+larg;
        }
        for(int i=0;i<cant;i++){
            int x=rand.nextInt(anch);
            int y=rand.nextInt(larg);
            if(temp[x][y]!=temp[serp1][serp2]&&temp[x][y]!=temp[man1][man2]){
                temp[x][y]='#';
            }
        }
    return temp;
    }
    public static String imprimir(char [][] tablero){
        String cosa="";
        for(int i=0; i<tablero.length;i++){
            for(int j=0;j<tablero[i].length;j++){
                cosa+="["+tablero[i][j]+"]";
            }
            cosa+="\n";
        }
        return cosa;
    }
}
