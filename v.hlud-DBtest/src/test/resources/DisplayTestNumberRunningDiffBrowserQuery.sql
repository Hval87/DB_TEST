SELECT count(browser) AS 'BROWSERS'  FROM test WHERE browser='chrome'
UNION
SELECT count(browser) FROM test WHERE browser='firefox'