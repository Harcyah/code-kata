
#!/bin/bash

TESTS=(stringTimes frontTimes countXX doubleX stringBits \
  stringSplosion last2 arrayCount9 \
  arrayFront9 array123 stringMatch \
  stringX altPairs stringYak array667 noTriples has271);

for TEST in "${TESTS[@]}"
do
  MAIN_CLASS=$(echo $TEST | perl -ne 'print ucfirst($_)')
  TEST_CLASS=$MAIN_CLASS"Test"
  MAIN_INSTANCE=$TEST
  MAIN_PATH=src/main/java/com/harcyah/kata/codingbat/warmup2/$TEST
  TEST_PATH=src/test/java/com/harcyah/kata/codingbat/warmup2/$TEST

  echo 'MAIN_CLASS: ' $MAIN_CLASS;
  echo 'TEST_CLASS: ' $TEST_CLASS;
  echo 'MAIN_INSTANCE: ' $MAIN_INSTANCE;

  echo 'MAIN_PATH: ' $MAIN_PATH;
  echo 'TEST_PATH: ' $TEST_PATH;

  mkdir -p $MAIN_PATH
  mkdir -p $TEST_PATH

  echo "package com.harcyah.kata.codingbat.warmup2.$TEST;

  public class $MAIN_CLASS {

    public void $TEST() {
      // TODO
    }

  }" > $MAIN_PATH/$MAIN_CLASS.java
  echo "package com.harcyah.kata.codingbat.warmup2.$TEST;

  import org.junit.Assert;
  import org.junit.Test;

  public class $TEST_CLASS {

    @Test
    public void test$TEST() {
      $MAIN_CLASS $MAIN_INSTANCE = new $MAIN_CLASS();
    }

  }" > $TEST_PATH/$TEST_CLASS.java
done
