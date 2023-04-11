# Approach:

We would use a technique what is known as “Relaxing Edges” wherein we would update our distance array if we find a better solution. We would do this N-1 times. 
Now why N-1? Understand that for a given graph with N nodes, the maximum number of edges we could have between any two nodes is N-1 in a single path. Moreover, our adjacency list might be in such a manner that only one node is updated in a single pass. Thus, to try out all nodes, we would require atleast N-1 iterations.The following is the demonstration of the same:


dis[]=999999;

<h3> Rellax all edges N-1 times</h3>
Rellax one
if(dist[u]+wt< dist[v])
dist[v]=dist[u]+wt

rellax 2 
if(dist[u]+wt< dist[v])
dist[v]=dist[u]+wt


for(int i = 1;i<=N-1;i++) {
    		for(Node node : edges) {
    			if(dist[node.getU()] + node.getWeight() < dist[node.getV()]) {
    				dist[node.getV()] = dist[node.getU()] + node.getWeight(); 
    			}
    		}
    	}

    	int fl = 0; 
    	for(Node node: edges) {
    		if(dist[node.getU()] + node.getWeight() < dist[node.getV()]) {
    			fl = 1;
    			System.out.println("Negative Cycle"); 
    			break;
    		}
    	}
    	if(fl == 0) {
    		for(int i = 0;i<N;i++) {
    			System.out.print(  dist[i]+" "); 
    		}
    	
        }

Time Complexity: O(N*E). We check E edges N times

Space Complexity: O(N). Distance Array

