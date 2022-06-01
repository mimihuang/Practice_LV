# Practice_Louvain
I found a useful tutorial online and then see(and modify) his/her code to learn more about louvain.

In the Louvain Method of community detection, first small communities are found by optimizing modularity locally on all vertices, then each small community is grouped into one vertex, and the first step is repeated. As 

The Louvain algorithm consists of two phases as follows:

**First Phase:**

1. Each vertex in the network is assigned to its own community, so say there are n vertex, then there are n community initially.
2. For each vertex i, calculate the modularity change \Delta D (or modularity difference) 
3. Keep the record of \Delta. If \Delta is calculated for all ajacent communities of i, add i to the community whose modularity increase is the greatest. Otherwise (or say, if there is no increase), i remains in its original community.
4. Apply the previous step repeatedly to all vertices until no increase occurs.

**Second phase:**

1. Compress the graph i.e., creating a new graph where the vertices are the communities built from the prevous phase. ( (I.) inter-community edges are now represented by self-loops on the new node (II.) intra-community edges are now represented as weighted edges between communities)
Iteratively execute.



Time complexity：O（E）
Space complexity：O（E）
