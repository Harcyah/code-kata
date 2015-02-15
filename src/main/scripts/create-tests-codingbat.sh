
#!/bin/bash

FOLDER=string1
TESTS=(helloName  makeAbba  makeTags makeOutWord extraEnd firstTwo firstHalf withoutEnd comboString nonStart left2 right2 theEnd withouEnd2 middleTwo endsLy nTwice twoChar middleThree hasBad atFirst lastChars conCat lastTwo seeColor frontAgain minCat extraFront without2 deFront startWord withoutX withoutX2);

for TEST in "${TESTS[@]}"
do
  MAIN_CLASS=$(echo $TEST | perl -ne 'print ucfirst($_)')
  TEST_CLASS=$MAIN_CLASS"Test"
  MAIN_INSTANCE=$TEST
  PACKAGE=com.harcyah.kata.codingbat.$FOLDER.$TEST
  MAIN_PATH=src/main/java/com/harcyah/kata/codingbat/$FOLDER/$TEST
  TEST_PATH=src/test/java/com/harcyah/kata/codingbat/$FOLDER/$TEST

  echo 'MAIN_CLASS: ' $MAIN_CLASS;
  echo 'TEST_CLASS: ' $TEST_CLASS;
  echo 'MAIN_INSTANCE: ' $MAIN_INSTANCE;

  echo 'MAIN_PATH: ' $MAIN_PATH;
  echo 'TEST_PATH: ' $TEST_PATH;

  mkdir -p $MAIN_PATH
  mkdir -p $TEST_PATH

  echo "package $PACKAGE;

  public class $MAIN_CLASS {

    public void $TEST() {
      // TODO
    }

  }
  " > $MAIN_PATH/$MAIN_CLASS.java
  echo "package $PACKAGE;

  import org.junit.Assert;
  import org.junit.Test;

  public class $TEST_CLASS {

    @Test
    public void test$TEST() {
      $MAIN_CLASS $MAIN_INSTANCE = new $MAIN_CLASS();
      Assert.assertTrue(false);
    }

  }
  " > $TEST_PATH/$TEST_CLASS.java
done
