// Clases del subsistema
class Room {
    private String name;
    private String description;
    // Otros métodos y variables

    public Room(String _name) {
        this.name = _name;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.description;
    }

    // Otros métodos
}
