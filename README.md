# nlp-assignment3

##training & testing files producing guide
* 請從Constant.java中修改參數,調整output的格式,可以選擇是否要印出空白行.同時輸出欄位的順序也是可以調整的
	* 需輸出training文檔
		* Main.java中的readFile 將輸入的file改成train_en.txt

				```
				public void readFile(){
					fileInput.readFile("train_en.txt");
				}
				```
		* Constant.java中的OUTPUTFIELD 改成Word,Capitalize,PosTag

				```
				public static final String[] OUTPUTFIELDS= {
					"word", "Capitalize" , "PosTag"
				};
				```
	* 需輸出test文檔
		* Main.java中的readFile 將輸入的file改成test_en.txt

				```
				public void readFile(){
					fileInput.readFile("test_en.txt");
				}
				```
		* Constant.java中的OUTPUTFIELD 改成Word,Capitalize,PosTag,NER
		
				```
				public static final String[] OUTPUTFIELDS= {
					"word", "Capitalize" , "PosTag" , "NER"
				};
				```

##work division

###10/25,26
* 大小寫 --finish
* 研究template
* standford POS tagging --finish
* 大小寫+bigram＋trigram
* main frame --structure is ready, need to refine

###10/26
* 請從Constant.java中修改參數,調整output的格式,可以選擇是否要印出空白行.同時輸出欄位的順序也是可以調整的

###10/27
* cfr++ training,develope template, report
* template自動化(optional)
* 介系詞, s, es, ed, ied, ing, ly, ,ion, er, ?(問句), :(分類電話地址傳真時間), /(日期)


##Column:
* ~~詞性(例如:動詞、名詞)~~
* ~~分類(例如:人物、地點)-廣泛性的分類~~
* 大小寫
* 大小寫+bigram＋trigram
* standford POS tagging


##feature
1. 大小寫
2. the + capitalize words
	* aa 全部小寫
	* AA 全部大寫
	* Aa 大寫開頭
	* AaAa 特殊單字，兩個大寫開頭的字組合
	* num 數字
	* character 符號
3. 第三種close track
	* 介系詞
	* s
	* es
	* ed
	* ied
	* ing
	* ly
	* ion
	* er
	* ? (問句)
	* : (分類電話地址傳真時間)
	* / (日期)



##Reference:
* http://hjdai.blogspot.tw/2006/12/howto-use-crf.html
* http://nlp.stanford.edu/software/tagger.shtml#Questions
