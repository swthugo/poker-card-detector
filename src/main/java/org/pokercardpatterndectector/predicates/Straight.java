package org.pokercardpatterndectector.predicates;

import org.pokercardpatterndectector.CardPattern;
import org.pokercardpatterndectector.PatternDetector;

public class Straight implements PatternPredicate {

  @Override
  public boolean detect(PatternDetector p) {
    return p.getIsStraight();
  }

  @Override
  public CardPattern getPattern() {
    return CardPattern.STRAIGHT;
  }
}
