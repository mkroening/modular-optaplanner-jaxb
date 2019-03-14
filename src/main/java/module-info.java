module io.github.mwkroening.modularoptaplannerjaxb {
  requires java.xml.bind;
  requires org.optaplanner.core;
  requires org.optaplanner.persistence.jaxb;

  opens io.github.mwkroening.modularoptaplannerjaxb to java.xml.bind;
}