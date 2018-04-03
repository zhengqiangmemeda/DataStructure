package graphy;

class Vertex{
	int no;
	String name;
	public Vertex(){}
	public Vertex(int no,String name){
		this.no=no;
		this.name=name;
	}
};
/** 
 * @ClassName: GraphyVisit 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @date 2018年4月3日 下午9:28:08 
 */
public class GraphyVisit {


	private int vertexNum;//顶点数量
    private Vertex[] vertexArr;//顶点集合
    private int[][] matrix;//邻接矩阵
    private boolean[] visit;
    //初始化
    public GraphyVisit(int n){
    	vertexNum=n;
    	vertexArr=new Vertex[n];
    	visit=new boolean[n];
    	matrix=new int[n][n];
    	for(int i=0;i<n;i++){
    		visit[i]=false;
    	}
    	for(int i=0;i<vertexNum;i++){
    		for(int j=0;j<vertexNum;j++){
    			matrix[i][j]=0;
    		}
    	}
    }
    //
    public void DFS(){
    	for(int i=0;i<vertexNum;i++){
    		if(!visit[i]){
    			travel(i);
    		}
    	}
    }
    //
    public void travel(int i){
    	visit[i]=true;
    	System.out.print(vertexArr[i].no);
    	for(int j=0;j<vertexNum;j++){
    		if(matrix[i][j]==1 && !visit[j]){
    			travel(j);
    		}
    	}
    }
    public void addEdge(int i, int j) {
        // 边的头尾不能为同一节点
        if (i == j)return;

        matrix[i][j] = 1;
        matrix[j][i] = 1;
    }
    public void setVertices(Vertex[] vertices) {
        this.vertexArr = vertices;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphyVisit g = new GraphyVisit(9);
        String[] ver = {"A","B","C","D","E","F","G","H","I"};
        Vertex[] vertices=new Vertex[9];
        for(int i=0;i<9;i++){
        	vertices[i]=new Vertex(i,ver[i]);
        }
        g.setVertices(vertices);

        g.addEdge(0, 1);
        g.addEdge(0, 5);
        g.addEdge(1, 0);
        g.addEdge(1, 2);
        g.addEdge(1, 6);
        g.addEdge(1, 8);
        g.addEdge(2, 1);
        g.addEdge(2, 3);
        g.addEdge(2, 8);
        g.addEdge(3, 2);
        g.addEdge(3, 4);
        g.addEdge(3, 6);
        g.addEdge(3, 7);
        g.addEdge(3, 8);
        g.addEdge(4, 3);
        g.addEdge(4, 5);
        g.addEdge(4, 7);
        g.addEdge(5, 0);
        g.addEdge(5, 4);
        g.addEdge(5, 6);
        g.addEdge(6, 1);
        g.addEdge(6, 3);
        g.addEdge(6, 5);
        g.addEdge(6, 7);
        g.addEdge(7, 3);
        g.addEdge(7, 4);
        g.addEdge(7, 6);
        g.addEdge(8, 1);
        g.addEdge(8, 2);
        g.addEdge(8, 3);

        System.out.print("深度优先遍历（递归）：");
        g.DFS();
	}

}
