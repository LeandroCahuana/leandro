-- Crear el registro si es que no se duplican datos unicos o se insertan datos nulos
INSERT INTO customer 
(dni, first_name, last_name, state)
VALUES 
('60989957', 'Leandro', 'Cahuana', 'A'),
('68590345', 'Martin', 'Perez', 'I'),
('15367890', 'Sebastian', 'Gonzalez', 'A'),
('12967593', 'Luis', 'Quispe', 'A'),
('64730123', 'Alex', 'Smith', 'I')
;

INSERT INTO advisor 
(dni, first_name, last_name, state)
VALUES 
('15627399', 'Leonardo', 'López', 'A'),
('10212826', 'Alexander', 'Hernández', 'A'),
('62311892', 'Maria', 'Sánchez', 'A'),
('15778322', 'Ana', 'Morales', 'A'),
('14909953', 'Elizabeth', 'Díaz', 'A')
;
