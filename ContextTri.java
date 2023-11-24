package org.elmaghrani.strategy.context;

import org.elmaghrani.strategy.strategies.AlgorithmeTri;

public class ContextTri {

        private AlgorithmeTri algorithmeTri;

        public void setAlgorithmeTri(AlgorithmeTri algorithmeTri) {
            this.algorithmeTri = algorithmeTri;
        }

        public void effectuerTri() {
               this.algorithmeTri.effectuerTri();
        }
    }

