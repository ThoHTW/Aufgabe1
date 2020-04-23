package Aufgabe1;

    public class CommandFactory {

        public ICommand createGCDSubReCmd() {
            return new GCDSubReCmd();
        }

        public ICommand createGCDSubItCmd() {
            return new GCDSubItCmd();
        }

        public ICommand createGCDDivRestRecCmd() {
            return new GCDDivRestRecCmd();
        }

        public ICommand createGCDDivRestItCmd() {
            return new GCDDivRestItCmd();
        }

        public ICommand SiebEratosthenes() {
            return new SiebEratosthenes();
        }
    }

