import java.util.*;



public class NotebookFilter {

    private List<NoteBook> notebooks;

    public NotebookFilter() {
        notebooks = new ArrayList<>();
    }

    public void addNotebook(NoteBook notebook) {
        notebooks.add(notebook);
    }

    public List<NoteBook> filterNotebooks(Map<Integer, Object> filters) {
        List<NoteBook> filteredNotebooks = new ArrayList<>();

        for (NoteBook notebook : notebooks) {
            boolean matchesFilters = true;

            for (Map.Entry<Integer, Object> entry : filters.entrySet()) {
                int filterType = entry.getKey();
                Object filterValue = entry.getValue();

                switch (filterType) {
                    case 1:
                        if (notebook.getRam() < (int) filterValue) {
                            matchesFilters = false;
                        }
                        break;
                    case 2:
                        if (notebook.getStorage() < (int) filterValue) {
                            matchesFilters = false;
                        }
                        break;
                    case 3:
                        if (!notebook.getOperatingSystem().equals(filterValue)) {
                            matchesFilters = false;
                        }
                        break;
                    case 4:
                        if (!notebook.getColor().equals(filterValue)) {
                            matchesFilters = false;
                        }
                        break;
                }

                if (!matchesFilters) {
                    break;
                }
            }

            if (matchesFilters) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }

    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook(8, 500, "Windows", "Silver");
        NoteBook notebook2 = new NoteBook(16, 1000, "MacOS", "Space Gray");
        NoteBook notebook3 = new NoteBook(8, 1000, "Windows", "Black");
        NoteBook notebook4 = new NoteBook(16, 2000, "Linux", "White");
        NoteBook notebook5 = new NoteBook(32, 2000, "Windows", "Silver");

        NotebookFilter notebookFilter = new NotebookFilter();
        notebookFilter.addNotebook(notebook1);
        notebookFilter.addNotebook(notebook2);
        notebookFilter.addNotebook(notebook3);
        notebookFilter.addNotebook(notebook4);
        notebookFilter.addNotebook(notebook5);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int filterType = scanner.nextInt();

        Object filterValue;
        if (filterType == 1 || filterType == 2) {
            System.out.println("Введите минимальное значение:");
            filterValue = scanner.nextInt();
        } else {
            System.out.println("Введите значение:");
            scanner.nextLine(); // Consume newline character
            filterValue = scanner.nextLine();
        }

        Map<Integer, Object> filters = new HashMap<>();
        filters.put(filterType, filterValue);

        List<NoteBook> filteredNotebooks = notebookFilter.filterNotebooks(filters);

        System.out.println("Подходящие ноутбуки:");
        for (NoteBook notebook : filteredNotebooks) {
            System.out.println("ОЗУ: " + notebook.getRam() + " ГБ");
            System.out.println("Объем ЖД: " + notebook.getStorage() + " ГБ");
            System.out.println("Операционная система: " + notebook.getOperatingSystem());
            System.out.println("Цвет: " + notebook.getColor());
            System.out.println();
        }
    }
}