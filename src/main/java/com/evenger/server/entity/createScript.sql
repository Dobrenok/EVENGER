#insert into user

INSERT INTO user
(id, login, name, surname, avatarName)
VALUES(1, #id
       "user1", #login
       "Tom", #name
       "Helton", #surname
       "1.jpg" #avatarName
);

INSERT INTO user
(id, login, name, surname, avatarName)
VALUES(2, #id
       "user2", #login
       "Nick", #name
       "Gregon", #surname
       "1.jpg" #avatarName
);


#insert into event

INSERT INTO event
(id, address, category, currentNumberOfPeople, date, description, maxNumberOfPeople, numberOfLikes, title, author_id, imageName, isChecked)
VALUES(1, #id
       "place1", #address
       "CONFERENCE", #category PARTY CONFERENCE
       7, #currentNumberOfPeople
       "2017-06-28 19:23:15", #date
       "This ie the first event! Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec qu", #description
       16, #maxNumberOfPeople
       1, #numberOfLikes
       "Региональный тур GenerationS: Челябинск", #title
       2, #author
       "1.jpg", #imageName
       true
);

INSERT INTO event
(id, address, category, currentNumberOfPeople, date, description, maxNumberOfPeople, numberOfLikes, title, author_id, imageName, isChecked)
VALUES(2, #id
          "place2", #address
          "CONFERENCE", #category PARTY CONFERENCE
          8, #currentNumberOfPeople
          "2017-06-28 19:23:15", #date
          "This ie the 2 event! Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.", #description
          50, #maxNumberOfPeople
          5, #numberOfLikes
          "Акселератор УрФУ", #title
          1, #author
          "2.jpg", #imageName
       true
);

INSERT INTO event
(id, address, category, currentNumberOfPeople, date, description, maxNumberOfPeople, numberOfLikes, title, author_id, imageName, isChecked)
VALUES(3, #id
          "place3", #address
          "CONFERENCE", #category PARTY CONFERENCE
          2, #currentNumberOfPeople
          "2017-06-28 19:23:15", #date
          "This ie the 3 event! Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.", #description
          23, #maxNumberOfPeople
          1, #numberOfLikes
          "Конференция .NET разработчиков ", #title
          1, #author
          "3.jpg", #imageName
       true
);

INSERT INTO event
(id, address, category, currentNumberOfPeople, date, description, maxNumberOfPeople, numberOfLikes, title, author_id, imageName, isChecked)
VALUES(4, #id
          "place4", #address
          "PARTY", #category PARTY CONFERENCE
          4, #currentNumberOfPeople
          "2017-06-28 19:23:15", #date
          "This ie the 4 event! Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Cum sociis natoque penatibus et magnis dis parturient", #description
          18, #maxNumberOfPeople
          6, #numberOfLikes
          "Cool party!", #title
          1, #author
          "4.jpg", #imageName
       true
);

INSERT INTO event
(id, address, category, currentNumberOfPeople, date, description, maxNumberOfPeople, numberOfLikes, title, author_id, imageName, isChecked)
VALUES(5, #id
          "place5", #address
          "CONFERENCE", #category PARTY CONFERENCE
          23, #currentNumberOfPeople
          "2017-06-28 19:23:15", #date
          "This ie the 3 event! Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibu", #description
          28, #maxNumberOfPeople
          20, #numberOfLikes
          "The Game of Java", #title
          2, #author
          "5.jpg", #imageName
       true
);