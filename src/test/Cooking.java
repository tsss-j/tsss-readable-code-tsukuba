package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cooking {
	public static void main(String[] args){
		/*
		 * ディレクトリ構造が変わったらrecipe-data.txt
		 * へのfilePassを変更する必要あり
		 */
		final String filePass = "C:/Users/jun/pleiades/workspace/test/recipe-data.txt";
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(filePass));

			String outputLine = "";
			/*一行ずつ出力*/
			int id = 1;
			while ((outputLine = br.readLine()) != null) {
				System.out.println(id + ": " + outputLine);
				id++;
			}
			br.close();
			}catch(IOException e){
			  System.out.println(e + "ファイル操作エラー");
			}
		}
}
