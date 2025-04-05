CREATE TABLE categories
(
    id         INT PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    created_at DATETIME,
    updated_at DATETIME,
    created_by VARCHAR(255),
    deleted_at DATETIME     NULL

);

CREATE TABLE products
(
    id          INT PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    category_id INT          NOT NULL,
    created_at  DATETIME,
    updated_at  DATETIME,
    created_by  VARCHAR(255),
    deleted_at  DATETIME     NULL,
    FOREIGN KEY (category_id) REFERENCES categories (id)
);