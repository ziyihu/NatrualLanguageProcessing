How to use this code.

First import the code file into the eclipse.
Then change every .java file’s head.
Change the package main.src.sm.nlp.spam.*; to the real package in the eclipse.
It also need an extra package, this library is in the code package, add library text.xml.

The input file is the test_review.txt.
In the spam1 file, go to the review, then open the ReviewParser.java.
In this java file, there are two places need the path of the test_review.txt and it also need a path to generate the result.txt.


The five features java files are in the spam.xml. The overall judgement is the Product.java, you can change the parameters set in this file.
The others are features file, there are ProductFeature.java, RatingFeatures.java, ReviewerFeature.java, ReviewFeature.java and TextualFeature.java.
Run the project from the spam1.review ReviewParser.java.
It will show the result in the Console and also generate the result.txt to the path you set.
We got 6 result.txt file and changed them to the .arff.
Those can be seen in the arff file.

Then use the result.txt to do the Weka experiments and get the final result.

The getraraword.java is to get the wordlist that appeared only once in the dataset.
The elimrare.java is to delete those useless words in the dataset.