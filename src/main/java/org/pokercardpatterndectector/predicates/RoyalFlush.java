package org.pokercardpatterndectector.predicates;

import org.pokercardpatterndectector.CardPattern;
import org.pokercardpatterndectector.PatternDetector;

public class RoyalFlush implements PatternPredicate {

  @Override
  public boolean detect(PatternDetector p) {
    return p.getIsFlush() && p.getIsStraight() && p.getHasAce();
  }

  @Override
  public CardPattern getPattern() {
    return CardPattern.ROYAL_FLUSH;
  }
}
