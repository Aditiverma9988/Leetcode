class Solution {
    public boolean isBipartite(int[][] graph) {
      int n=graph.length;
      int [] color=new int[n];
      Arrays.fill(color,-1);
      for(int i=0;i<n;i++){
        if(color[i]==-1){
            if(!dfs(i,0,graph,color)){
                return false;
            }
        }
      }  
      return true;
    }
    public boolean dfs(int node,int col,int[][] graph,int[]color){
        color[node]=col;
        for(int ngh:graph[node]){
            if(color[ngh]==-1){
                if(!dfs(ngh,1-col,graph,color)){
                    return false;
                }
            }
            else if(color[ngh]==color[node]){
                return false;
            }
        }
        return true;
    }
}