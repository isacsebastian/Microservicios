CREATE TABLE IF NOT EXISTS student(
    id SERIAL PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    career VARCHAR(100) NOT NULL UNIQUE
);
