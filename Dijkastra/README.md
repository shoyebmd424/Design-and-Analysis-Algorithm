# We can implement the algorithm using the following steps:
We would be using a min-heap and a distance array of size N initialized with infinity (indicating that at present none of the nodes are reachable from the source node) and initialize the distance to source node as 0.
We push the source node to the queue.
For every node at the top of the queue we pop that element out and look out for its adjacent nodes. If the current reachable distance is better than the previous distance indicated by the distance array, we update the distance and push it in the queue.
A node with a lower distance would be at the top of the priority queue as opposed to a node with a higher distance. By following the steps 3, until our queue becomes empty, we would get the minimum distance from the source node to all other nodes. Here’s a quick demonstration of the same.
