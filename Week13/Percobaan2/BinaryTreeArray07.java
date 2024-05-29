package Week13.Percobaan2;

public class BinaryTreeArray07 {
    int [] data;
    int idxLast;

    public BinaryTreeArray07(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart<=idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.println(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
}