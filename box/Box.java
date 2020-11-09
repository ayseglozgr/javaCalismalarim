/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author Aysegul
 */
public class Box {

    int width;

    int height;

    int depth;
   

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        
    }

    public Box(int width) {
        this.width = width;   // sağ taraf const. aldığı değeri gösterir.(yani int width). sol taraf fieldları gösterir.
        this.height= width;
        this.depth=width;
    }

    public Box() {  // const. çağırıldığı zaman fieldlarda burda atadığımız değerler üzerinden işlem yapılıyor.
        this.width = -1;   
        this.height= -1;
        this.depth=-1;

    }
    
    int volume() {

        return width * height * depth;

    }
}
