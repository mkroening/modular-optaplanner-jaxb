package io.github.mwkroening.modularoptaplannerjaxb;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.persistence.jaxb.api.score.buildin.hardsoft.HardSoftScoreJaxbXmlAdapter;

public class App {

  private HardSoftScore score;

  public static void main(String[] args) {
    final var app = new App();
    app.setScore(HardSoftScore.of(-1, -5));
    JAXB.marshal(app, System.out);
  }

  @XmlJavaTypeAdapter(HardSoftScoreJaxbXmlAdapter.class)
  public HardSoftScore getScore() {
    return score;
  }

  public void setScore(HardSoftScore score) {
    this.score = score;
  }
}
