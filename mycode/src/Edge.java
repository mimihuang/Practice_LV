public class Edge implements Cloneable{  
    int v;     //vertex 
    double weight;  //edge weight
    int next;    //next edge connecting to the associated vertex 
    Edge(){}  
    public Object clone(){  
        Edge temp=null;  
        try{    
            temp = (Edge)super.clone();   
        }catch(CloneNotSupportedException e) {    
            e.printStackTrace();    
        }     
        return temp;  
    }  
}  