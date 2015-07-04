package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cooking {
	public static void main(String[] args){
		/*
		 * ディレクトリ構造が変わったらfilePassを変更する必要あり
		 */
		final String filePass = "C:/Users/jun/pleiades/workspace/test/recipe-data.txt";
		try{
			/*
			 * recipe-dataをオープン
			 * ユーザの階層へのパス書き換えが必要
			 *
			 */
			BufferedReader br = new BufferedReader(new FileReader(filePass));

			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
			}catch(IOException e){
			  System.out.println(e + "ファイル操作エラー");
			}
		}
}
