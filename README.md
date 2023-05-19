# Design-and-Analysis-Algorithm
 Algorithms

 Searching: 
1) Binary Search  
2) Linear Search 
3) Depth First Search  
4) Breadth First Search  
5) Rabin-Karp Algorithm 
6) Z Algorithm 

Sorting: 
1) Insertion Sort 
2) Heap Sort 
3) Selection Sort 
4) Merge Sort 
5) Quick Sort 
6) Counting Sort 
7) Bucket Sort  
8) Bubble Sort  
9) Radix Sort  
10) Shell Sort  
11) Comb Sort  
12) Pigeonhole Sort  
13) Cycle Sort 

Graphs: 
1) Kruskal's Algorithm 
2) Dijkstra's Algorithm 
3) Bellman Ford Algorithm 
4) Floyd Warshall Algorithm 
5) Topological Sort Algorithm 
6) Flood Fill Algorithm 
7) Lee Algorithm 
8) Prim's Algorithm 
9) Boruvka's Algorithm 
10) Johnson's Algorithm 
11) Kosaraju's Algorithm 
12) Tarjan's Algorithm 

Arrays: 
1) Kadane's Algorithm 
2) Floyd's Cycle Detection Algorithm 
3) Knuth-Morris-Pratt Algorithm (KMP) 
4) Quick Select Algorithm 
5) Boyer - More Majority Vote Algorithm 

Tree: 
1) AA Tree 
2) Binary Indexed Tree or Fenwick Tree  
3) Quadtree 
4) Cartesian Tree 
5) Fibonacci heap 
6) Interval Tree  
7) Finger Tree 
8) Crit-bit Trees 
9) Scapegoat Tree 
10) Splay Tree 
11) Suffix Tree 
12) Counted B-Trees 
13) Binary Space Partitioning 
14) Van Emde Boas Tree 

Others: 
1) Huffman Coding Compression Algorithm 
2) Euclid's Algorithm 
3) Union Find Algorithm 
4) Manacher's Algorithm  
5) Eukerian Path (Hierholzer's Algorithm)  
6) Convex Hull | Set 1 (Jarvis’s Algorithm or Wrapping) 
7) Convex Hull | Set 2 (Graham Scan) 
8) Convex Hull using Divide and Conquer Algorithm 
9) Quickhull Algorithm for Convex Hull 
10) Distinct elements in subarray using Mo’s Algorithm 
11) Line Sweep Algorithm 
12) MO’s Algorithm (Query square root decomposition) 
13) Disjoint-set Data Structure 
14) Ackermann Function 
15) Zobrist Hashing 
16) FM-index 
17) Circular buffer 
18) Hungarian Algorithm / Kuhn–Munkres Algorithm / Munkres Assignment Algorithm 
19) Dekker's Algorithm 
20) Winged Edge 
21) Burrows–Wheeler Transform 
22) Zipper 
23) Five Balltree Construction Algorithms 
24) Cuckoo Hashing 
25) Rope (Data Structure) 
26) Binary Decision Diagram 
27) Disjoint-set Data Structure 
28) Bloom Filter 



<h1> short comparator method</h1>
PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                double x = a[0] / (1.0 * a[1]);
                double y = b[0] / (1.0 * b[1]);
                return x > y? -1 : 1;
            }
        );
