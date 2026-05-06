[![Build Automation](https://github.com/jeidi19/provaPraticaMTSS/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/jeidi19/provaPraticaMTSS/actions/workflows/build.yml)
[![Coverage Status](https://coveralls.io/repos/github/jeidi19/provaPraticaMTSS/badge.svg?branch=main&t=1)](https://coveralls.io/github/jeidi19/provaPraticaMTSS?branch=main&t=1)

# Prova pratica MTSS
## Analisi Statica e Qualità
L'analisi statica del codice viene eseguita automaticamente ad ogni push/pull request tramite il plugin **Checkstyle**, utilizzando le regole fornite nel file `checkstyle.xml`. 
Il superamento di tali controlli è vincolante per il successo della Build Automation (rappresentata dal badge "Build Automation" qui sopra).


## Implementazione
Per lo sviluppo del progetto è stato usato git flow, però data la ridotta complessità dell'applicativo si è deciso di non utilizzare i branch release/, creando l'unica versione nel branch develop e implementando le varie features tramite i branch feature/. 


Antonio Tufano 2137972 \
Jacopo De Donà 2104894
