# nlp-assignment3

##work division

###10/25
* 大小寫 --finish
* 研究template
* standford POS tagging --finish
* 大小寫+bigram＋trigram
* main frame --structure is ready, need to refine

###10/27
* cfr++ training,develope template, report
* template自動化(option)
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

##issue:
* ~~what is O mean ??~~
* ~~是否能直接使用網路上提供的POS tag?~~
