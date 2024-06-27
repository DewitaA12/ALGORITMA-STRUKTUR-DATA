package Week14.Percobaan1;

public class Graph07 {
    int vertex;
    DLL07 list[];

    public Graph07(int v) {
        vertex = v;
        list = new DLL07[v];
        for (int i = 0; i<v; i++) {
            list[i] = new DLL07();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        //list[tujuan].addFirst(asal,jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;
        // inDegree
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].getJarak(j) == asal) {
                    ++totalIn;
                    break; // Hentikan iterasi setelah menemukan indegree
                }
            }
        }
       // outDegree
    totalOut = list[asal].size();

    System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
    System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
    System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
}

// public void removeEdge(int asal, int tujuan) throws Exception {
//     for (int i = 0; i < vertex; i++) {
//         if (i == tujuan) {
//             list[asal].remove(tujuan);
//         }
//     }
//}

public void removeEdge(int asal, int tujuan) throws Exception {
    if (asal < 0 || asal >= vertex || tujuan < 0 || tujuan >= vertex) {
        throw new Exception("Indeks di luar batas");
    }

    // Remove edge from source node's list
    Node07 current = list[asal].head;
    while (current != null) {
        if (current.data == tujuan) {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                list[asal].head = current.next;
            }

            if (current.next != null) {
                current.next.prev = current.prev;
            }

            list[asal].size--;
            break;
        }
        current = current.next;
    }

    // Remove edge from destination node's list (if it exists)
    current = list[tujuan].head;
    while (current != null) {
        if (current.data == asal) {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                list[tujuan].head = current.next;
            }

            if (current.next != null) {
                current.next.prev = current.prev;
            }

            list[tujuan].size--;
            break;
        }
        current = current.next;
    }
}

public void removeAllEdges(){
    for (int i =0; i < vertex; i++) {
        list[i].clear();
    }
    System.out.println("Graf berhasil dikosongkan");
}


public void printGraph07() throws Exception {
    for (int i = 0; i < vertex; i++) {
        if (list[i].size() > 0) {
            System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
            for (int j = 0; j < list[i].size(); j++) {
                if (j < list[i].size()) { // Check if j is still in a valid range
                    System.out.print((char) ('A' + list[i].getJarak(j)) + " (" + list[i].getJarak(j) + " m)");
                    if (j < list[i].size() - 1) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.println("");
        } else {
            System.out.println();
        }
    }
    System.out.println("");
}

public boolean hasPath(int asal, int tujuan) throws Exception {
    boolean[] visited = new boolean[vertex];
    return hasPathDFS(asal, tujuan, visited);
}

private boolean hasPathDFS(int current, int tujuan, boolean[] visited) {
    if (current == tujuan) {
        return true;
    }
    visited[current] = true;
    for (int neighbor : list[current].getAllData()) {
        if (!visited[neighbor]) {
            if (hasPathDFS(neighbor, tujuan, visited)) {
                return true;
            }
        }
    }
    return false;
}

public void updateJarak(int asal, int tujuan, int jarakBaru) throws Exception {
    Node07 current = list[asal].head;
    while (current != null) {
        if (current.data == tujuan) {
            current.jarak = jarakBaru;
            break;
        }
        current = current.next;
    }
}

public int hitungEdge() {
    int totalEdge = 0;
    for (int i = 0; i < vertex; i++) {
        totalEdge += list[i].size();
    }
    return totalEdge;
}

}

