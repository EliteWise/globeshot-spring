INSERT INTO Client (name, profile_pic_url, password, email, pictures_liked) VALUES ('Eliteeee', 'https://fastly.picsum.photos/id/730/200/300.jpg?hmac=Xa_29B3ZIok8lz4JGLZUBU_ARxJew0twrMWMHEy_T1I', 'pass', 'elite@gmail.com', 0);
INSERT INTO Client (name, profile_pic_url, password, email, pictures_liked) VALUES ('Bernard', 'https://fastly.picsum.photos/id/337/200/300.jpg?hmac=0CnfGB9OuB4D8IneXqgjPMaGgLSHBKRjSkl_ITBmDxQ', 'nopass', 'Bernard@gmail.com', 0);
INSERT INTO Client (name, profile_pic_url, password, email, pictures_liked) VALUES ('Lucien', 'https://fastly.picsum.photos/id/145/200/300.jpg?hmac=mIsOtHDzbaNzDdNRa6aQCd5CHCVewrkTO5B1D4aHMB8', 'password', 'Lucien@gmail.com', 0);

INSERT INTO Country (name, flag_url) VALUES ('France', 'https://fakeurl.com/flags/france.png');

INSERT INTO Picture (url, country_id, creation_date)
VALUES
('https://fastly.picsum.photos/id/730/200/300.jpg?hmac=Xa_29B3ZIok8lz4JGLZUBU_ARxJew0twrMWMHEy_T1I', 1, NOW()),
('https://fastly.picsum.photos/id/337/200/300.jpg?hmac=0CnfGB9OuB4D8IneXqgjPMaGgLSHBKRjSkl_ITBmDxQ', 1, NOW()),
('https://fastly.picsum.photos/id/145/200/300.jpg?hmac=mIsOtHDzbaNzDdNRa6aQCd5CHCVewrkTO5B1D4aHMB8', 1, NOW());