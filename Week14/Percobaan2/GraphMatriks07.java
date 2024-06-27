package Week14.Percobaan2;

public class GraphMatriks07 {
    int vertex;
    int [][] matriks;
    int[] inDegree;
    int[] outDegree;


    public GraphMatriks07(int v) {
        vertex = v;
        matriks = new int[v][v];
        inDegree = new int[v];
        outDegree = new int[v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
        outDegree[asal]++;
        inDegree[tujuan]++;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0; // Asumsi jarak 0 untuk remove, bisa disesuaikan dengan kebutuhan
        outDegree[asal]--;
        inDegree[tujuan]--;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung  " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public void degree(int node) {
        int in = inDegree[node];
        int out = outDegree[node];
        System.out.println("InDegree dari Gedung " + (char) ('A' + node) + ": " + in);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + node) + ": " + out);
        System.out.println("Degree dari Gedung " + (char) ('A' + node) + ": " + (in + out));
    }
}
