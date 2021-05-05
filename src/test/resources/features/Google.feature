Feature: Probar la busqueda en Google

Scenario: Buscar algo en Google
Given navego en google
When busco algo 
And  click  en el boton search
Then obtengo unos resultados

