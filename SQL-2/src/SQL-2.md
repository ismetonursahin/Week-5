1- film tablosunda bulunan tüm sütunlardaki verileri replacement cost değeri 12.99 dan büyük eşit ve 16.99 küçük olma koşuluyla sıralayınız ( BETWEEN - AND yapısını kullanınız.)

<h2>SELECT title,replacement_cost FROM film <br>
WHERE replacement_cost BETWEEN 12.99 AND 16.99;</h2>

![img.png](img.png)

----------------
2- actor tablosunda bulunan first_name ve last_name sütunlardaki verileri first_name 'Penelope' veya 'Nick' veya 'Ed' değerleri olması koşuluyla sıralayınız. ( IN operatörünü kullanınız.)


<h2>SELECT first_name,last_name FROM actor <br>
WHERE first_name IN ('Penelope','Nick','Ed'); </h2>

![img_1.png](img_1.png)

--------------
3- film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99, 2.99, 4.99 VE replacement_cost 12.99, 15.99, 28.99 olma koşullarıyla sıralayınız. ( IN operatörünü kullanınız.)

<h2>SELECT title,rental_rate,replacement_cost FROM film <br>
WHERE rental_rate  IN (0.99, 2.99, 4.99) AND replacement_cost IN (12.99, 15.99, 28.99) ; </h2>


![img_2.png](img_2.png)