/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gemina_quiz3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Gemina_Quiz3V2 {
    
    static int MAX = 10;
    
    private int [] data = new int [MAX];
    private int front;
    private int rear;
    
    private void insertion(int index) throws Exception{
        if((front == 0 && rear == MAX - 1)|| (rear + 1 == front)){
            throw new Exception("Queue is Full");
        }
        if (rear == MAX -1){
            rear = 0;
        }else if (front == 1){
            front = 0;
        }else{
            data[rear++] = index;
        }
        
    }
    private void insertionBeginning(int index)throws Exception{
        
        
        
    }
    private int deletion(int index)throws Exception{
        if (front == -1){
            throw new Exception("Queue is Empty");
        }
        int temporary = data [front];
        
        if (front == rear){
            front = rear = -1;
        }else if (front == MAX -1){
            front = 0;
        }else{
            front++;
        }
        return temporary;
        
    }
    public int deletionBeginning(int index) throws Exception {
        if (front == -1) {
            throw new Exception("Queue is Empty");
        }
        int temporary = data[front];
        if (front == rear) {
            front = rear = -1;
        }
        else {
            front++;
        }
        return temporary;
    }
    public int deletionEnding(int index) throws Exception {
        if (front == -1) {
            throw new Exception("Queue is Empty");
        }
        int temporary = data[rear];
        if (front == rear) {
            front = rear = -1;
        }
        else {
            rear--;
        }
        return temporary;
    }
    
    public void display() throws Exception {
        if (front == -1) {
            throw new Exception("Queue is Empty");
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(data[i] + "->");
        }
        
        System.out.println("NULL");
    }
    
    
   
    
    public static void main(String[] args) throws Exception {
       Gemina_Quiz3V2 queue = new Gemina_Quiz3V2();
       Scanner scn = new Scanner(System.in);
       
       while (true){
           System.out.println("[=================Menu================]");
           System.out.println("|===== 1. Insert Queue           =====|");
           System.out.println("|===== 2. Delete Beginning Queue =====|");
           System.out.println("|===== 3. Delete Ending Queue    =====|");
           System.out.println("|===== 4. Display Queue          =====|");
           System.out.println("[=====================================]");
           int choice = scn.nextInt();
           int index;
           
           switch(choice){
               case 1: 
                   System.out.println("Enter Queue: ");
                   index = scn.nextInt();
                   queue.insertion(index);
                   break;
               case 2:
                   System.out.println("{===== Queue at the beginning deleted succesfully =====}");
                   index = scn.nextInt();
                   queue.deletionBeginning(index);
                   break;
               case 3:
                   System.out.println("{===== Queue at the ending deleted succesfully =====}");
                   index = scn.nextInt();
                   queue.deletionEnding(index);
                   break;
               case 4:
                   System.out.println("{===== Your Queues =====}");
                   queue.display();
                   break;
               default:
                   throw new AssertionError();
                           
           }
           //Number 2 ni sir hehehe
       }
                
        }
        
        
    }

