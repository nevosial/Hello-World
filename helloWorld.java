//Hello World.

class helloWorld {
  public static void main(String args[]){
  System.out.println("Hello World !");
  }
}

/***
Step 1: javac helloWorld.java
stp 1a: helloWorld.class is created.
Step 3: java helloWorld

keyword : description
public  : makes the object/method available to the entire prog.
static  : makes a variable/method value persistent in the entire program. Helps in efficient memory utilization.
        : Example - In a classroom class, we define variables student A, B, C and static String projector status ='On'
        : This means the projector variable referenced by any student object A, B, C will always find the value of projector as 'On'.
        : JRE will not create separate object in memory about projector for obj A, obj B, obj C.
void    : main function does not have to return anything so it is set as void.

**/
