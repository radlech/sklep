insert into user values
(nextval('user_seq'),'andrzej@wupe.pl','$2a$12$I7zE0znd2InmIZ.7bdGNou3nUkTbfbFVA4PCtqqHOnc5XUX7i1Ls.','ROLE_ADMIN',true,null),
(nextval('user_seq'),'hubert@wupe.pl','$2a$12$I7zE0znd2InmIZ.7bdGNou3nUkTbfbFVA4PCtqqHOnc5XUX7i1Ls.','ROLE_EMPLOYEE',true,null),
(nextval('user_seq'),'zbigniew@wupe.pl','$2a$12$I7zE0znd2InmIZ.7bdGNou3nUkTbfbFVA4PCtqqHOnc5XUX7i1Ls.','ROLE_CUSTOMER',true,null),
(nextval('user_seq'),'jerzy@wupe.pl','$2a$12$I7zE0znd2InmIZ.7bdGNou3nUkTbfbFVA4PCtqqHOnc5XUX7i1Ls.','ROLE_CUSTOMER',true,null),
(nextval('user_seq'),'halina@wupe.pl','$2a$12$I7zE0znd2InmIZ.7bdGNou3nUkTbfbFVA4PCtqqHOnc5XUX7i1Ls.','ROLE_CUSTOMER',true,null);

insert into employee values
(nextval('employee_seq'),1,'Andrzej','Adminowski','Administrator systemu'),
(nextval('employee_seq'),2,'Hubert','Pracowity','Młodszy specjalista ds. sprzedaży');

insert into customer values
(nextval('customer_seq'),3,'Zbigniew','Rozrzutny','501100900','ul. Długa 144','Nowe Miasto','98-765'),
(nextval('customer_seq'),4,'Jerzy','Kowalski','712612512','ul. Pokątna 9A','Stara Wieś','87-654'),
(nextval('customer_seq'),3,'Halina','Nowak','698001002','os. Fioletowe 2/19','Fioletowo Wielkie','76-789');

insert into category values
(nextval('category_seq'),'Konsole','fas fa-arrow-circle-right'),
(nextval('category_seq'),'Telewizory','fas fa-arrow-circle-right'),
(nextval('category_seq'),'Laptopy','fas fa-arrow-circle-right');

insert into product values
(nextval('product_seq'),1,'Konsola PlayStation 4',1529.00,1199.00,'Nullam semper ipsum ut efficitur dapibus. Etiam ut finibus lectus, vel bibendum ex. Nunc fringilla, nulla eu dignissim porta, nisl elit egestas ex, in gravida elit augue vitae orci. Duis euismod enim non nunc congue, ut luctus lorem pharetra. Duis vel sodales nisl. Aenean id purus sit amet libero egestas eleifend quis nec metus. Nulla condimentum vestibulum massa nec aliquam. Sed eget vehicula ligula. Duis id nisl in diam viverra elementum. Aliquam a pulvinar metus. Etiam felis justo, vestibulum quis mi quis, finibus convallis felis. Suspendisse lectus nulla, tincidunt a quam eget, consectetur pellentesque ipsum. Fusce tempus nisl quis mi sodales, at venenatis nulla bibendum. Praesent viverra tempus justo quis tincidunt.', 8),
(nextval('product_seq'),1,'Konsola Xbox One S',1249.00,null,'Nullam semper ipsum ut efficitur dapibus. Etiam ut finibus lectus, vel bibendum ex. Nunc fringilla, nulla eu dignissim porta, nisl elit egestas ex, in gravida elit augue vitae orci. Duis euismod enim non nunc congue, ut luctus lorem pharetra. Duis vel sodales nisl. Aenean id purus sit amet libero egestas eleifend quis nec metus. Nulla condimentum vestibulum massa nec aliquam. Sed eget vehicula ligula. Duis id nisl in diam viverra elementum. Aliquam a pulvinar metus. Etiam felis justo, vestibulum quis mi quis, finibus convallis felis. Suspendisse lectus nulla, tincidunt a quam eget, consectetur pellentesque ipsum. Fusce tempus nisl quis mi sodales, at venenatis nulla bibendum. Praesent viverra tempus justo quis tincidunt.', 13),
(nextval('product_seq'),2,'Telewizor Samsung UE43RU7172 4K',1699.00,1419.00,'Nullam semper ipsum ut efficitur dapibus. Etiam ut finibus lectus, vel bibendum ex. Nunc fringilla, nulla eu dignissim porta, nisl elit egestas ex, in gravida elit augue vitae orci. Duis euismod enim non nunc congue, ut luctus lorem pharetra. Duis vel sodales nisl. Aenean id purus sit amet libero egestas eleifend quis nec metus. Nulla condimentum vestibulum massa nec aliquam. Sed eget vehicula ligula. Duis id nisl in diam viverra elementum. Aliquam a pulvinar metus. Etiam felis justo, vestibulum quis mi quis, finibus convallis felis. Suspendisse lectus nulla, tincidunt a quam eget, consectetur pellentesque ipsum. Fusce tempus nisl quis mi sodales, at venenatis nulla bibendum. Praesent viverra tempus justo quis tincidunt.', 4),
(nextval('product_seq'),2,'Telewizor Samsung LED UE50NU7022',2349.00,1999.00,'Nullam semper ipsum ut efficitur dapibus. Etiam ut finibus lectus, vel bibendum ex. Nunc fringilla, nulla eu dignissim porta, nisl elit egestas ex, in gravida elit augue vitae orci. Duis euismod enim non nunc congue, ut luctus lorem pharetra. Duis vel sodales nisl. Aenean id purus sit amet libero egestas eleifend quis nec metus. Nulla condimentum vestibulum massa nec aliquam. Sed eget vehicula ligula. Duis id nisl in diam viverra elementum. Aliquam a pulvinar metus. Etiam felis justo, vestibulum quis mi quis, finibus convallis felis. Suspendisse lectus nulla, tincidunt a quam eget, consectetur pellentesque ipsum. Fusce tempus nisl quis mi sodales, at venenatis nulla bibendum. Praesent viverra tempus justo quis tincidunt.', 2),
(nextval('product_seq'),3,'Laptop Dell Latitude 5490',6200.00,null,'Nullam semper ipsum ut efficitur dapibus. Etiam ut finibus lectus, vel bibendum ex. Nunc fringilla, nulla eu dignissim porta, nisl elit egestas ex, in gravida elit augue vitae orci. Duis euismod enim non nunc congue, ut luctus lorem pharetra. Duis vel sodales nisl. Aenean id purus sit amet libero egestas eleifend quis nec metus. Nulla condimentum vestibulum massa nec aliquam. Sed eget vehicula ligula. Duis id nisl in diam viverra elementum. Aliquam a pulvinar metus. Etiam felis justo, vestibulum quis mi quis, finibus convallis felis. Suspendisse lectus nulla, tincidunt a quam eget, consectetur pellentesque ipsum. Fusce tempus nisl quis mi sodales, at venenatis nulla bibendum. Praesent viverra tempus justo quis tincidunt.', 5);

insert into photo values
(nextval('photo_seq'),1,'ps4dgddsg.jpg',3),
(nextval('photo_seq'),1,'ps4jgffiu.jpg',1),
(nextval('photo_seq'),1,'ps4opyuis.jpg',2),
(nextval('photo_seq'),2,'xbsasfsdd.jpg',2),
(nextval('photo_seq'),2,'xbshjerok.jpg',1),
(nextval('photo_seq'),3,'s43fhfhdf.jpg',1),
(nextval('photo_seq'),4,'s50osksdd.jpg',1),
(nextval('photo_seq'),4,'s50hkgsdo.jpg',2),
(nextval('photo_seq'),5,'dl5jdskgg.jpg',4),
(nextval('photo_seq'),5,'dl5orergj.jpg',2),
(nextval('photo_seq'),5,'dl5eutsdj.jpg',3),
(nextval('photo_seq'),5,'dl5jgkfjk.jpg',1);

insert into orders values
(nextval('order_seq'),1,'zrealizowane','2019-07-29 14:01:00', null, '2019-07-29 14:04:00', 'inv-2019-01.pdf'),
(nextval('order_seq'),1,'zrealizowane','2019-08-10 12:35:00', null, '2019-08-11 09:47:00', 'inv-2019-02.pdf'),
(nextval('order_seq'),2,'zrealizowane','2019-08-12 21:11:00', 'Tylko dobrze zapakujcie!!!', '2019-08-12 21:24:00', 'inv-2019-03.pdf'),
(nextval('order_seq'),1,'nieopłacone','2019-08-13 15:56:00', 'Zapłacę jutro', null, null),
(nextval('order_seq'),1,'koszyk',null, null, null, null);

insert into order_product values
(nextval('order_product_seq'),1,5,1,6350.00),
(nextval('order_product_seq'),2,2,1,1249.00),
(nextval('order_product_seq'),2,4,1,2199.00),
(nextval('order_product_seq'),3,1,2,1199.00),
(nextval('order_product_seq'),4,5,4,6200.00),
(nextval('order_product_seq'),5,2,1,1249.00),
(nextval('order_product_seq'),5,3,2,1299.00);

