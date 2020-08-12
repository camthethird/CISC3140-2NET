SELECT population FROM world
  WHERE name = 'Germany'

/* Show's the population of the country named Germany from the World database */

SELECT name, population FROM world
  WHERE name IN ('Sweden', 'Norway', 'Denmark');

/* Shows (returns) the name and population of the countries Sweden, Norway, and Denmark */

SELECT name, area FROM world
  WHERE area BETWEEN 200000 AND 250000  

/* Shows the name and are of countries with area's between 200000 and 250000 sq km.  */

SELECT name FROM world
  WHERE name LIKE 'Y%'

/* Shows countries that begin with the letter Y */

SELECT name FROM world
  WHERE name LIKE '%y'

/*Shows countrues with names that end with y */  

SELECT name FROM world
  WHERE name LIKE '%x%'

/*Shows countries that include the letter x in their name */     

SELECT name FROM world
WHERE population >= 200000000

/*Returns countries that have a population that is greater than or equal to 200M */ 
