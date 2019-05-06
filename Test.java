package filecompress;

public class Test {
	public static void main(String[] args) throws Exception {
		//创建压缩对象
		Compress compress = new Compress();
		//统计文件中0-255出现的次数
		compress.countTimes("src/filecompress/The Old Man and the Sea.txt");
		//构造哈夫曼树，并得到根节点
		HuffmNode root=compress.createTree();
		//得到哈夫曼编码
		compress.getHuffmCode(root, "");
		//压缩文件
		compress.compress("src/filecompress/The Old Man and the Sea.txt",
				"src/filecompress/The Old Man and the Sea.zip");
		//解压文件

		Decompress d = new Decompress();
		d.decompress("src/filecompress/The Old Man and the Sea.zip",
				"src/filecompress/The Old Man and the Sea(Dcompress).txt");
	
		
	}
 
}