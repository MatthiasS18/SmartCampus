BEGIN;

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

CREATE TABLE room (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    building VARCHAR(255) NOT NULL,
    floor INT NOT NULL,
    capacity INT NOT NULL
);

CREATE TABLE equipment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    room_id BIGINT NOT NULL,

    CONSTRAINT fk_equipment_room
        FOREIGN KEY (room_id)
        REFERENCES room(id)
);

CREATE TABLE reservation (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    start_date_time DATETIME NOT NULL,
    end_date_time DATETIME NOT NULL,
    status VARCHAR(50) NOT NULL,
    room_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,

    CONSTRAINT fk_reservation_room
        FOREIGN KEY (room_id)
        REFERENCES room(id),

    CONSTRAINT fk_reservation_user
        FOREIGN KEY (user_id)
        REFERENCES users(id)
);

CREATE TABLE incident (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    priority VARCHAR(50) NOT NULL,
    status VARCHAR(50) NOT NULL,
    room_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,

    CONSTRAINT fk_incident_room
        FOREIGN KEY (room_id)
        REFERENCES room(id),

    CONSTRAINT fk_incident_user
        FOREIGN KEY (user_id)
        REFERENCES users(id)
);

COMMIT;