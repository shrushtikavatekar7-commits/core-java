class CameraExecutor {

    public static void main(String[] args) {

        boolean cam1 = Camera.createCamera("Canon", "EOS 1500D", 45000, 24,
                "Black", "DSLR", 2000, true, true, 1.5);
        if (cam1) Camera.getCameraDetails();

        boolean cam2 = Camera.createCamera("Nikon", "D7500", 85000, 20,
                "Black", "DSLR", 1900, true, false, 1.2);
        if (cam2) Camera.getCameraDetails();

        boolean cam3 = Camera.createCamera("Sony", "Alpha 6400", 90000, 24,
                "Silver", "Mirrorless", 1800, true, true, 0.8);
        if (cam3) Camera.getCameraDetails();

        boolean cam4 = Camera.createCamera("Fujifilm", "XT-4", 125000, 26,
                "Black", "Mirrorless", 2200, true, true, 0.9);
        if (cam4) Camera.getCameraDetails();

        boolean cam5 = Camera.createCamera("Panasonic", "Lumix G7", 55000, 16,
                "Black", "Mirrorless", 1500, true, false, 1.1);
        if (cam5) Camera.getCameraDetails();

        boolean cam6 = Camera.createCamera("Olympus", "OM-D E-M10", 60000, 20,
                "Silver", "Mirrorless", 1700, true, true, 0.7);
        if (cam6) Camera.getCameraDetails();

        boolean cam7 = Camera.createCamera("Leica", "Q2", 350000, 47,
                "Black", "Compact", 1800, true, true, 0.75);
        if (cam7) Camera.getCameraDetails();

        boolean cam8 = Camera.createCamera("GoPro", "Hero 12", 45000, 27,
                "Black", "Action", 1400, true, true, 0.4);
        if (cam8) Camera.getCameraDetails();

        boolean cam9 = Camera.createCamera("Canon", "EOS R6", 220000, 20,
                "Black", "Mirrorless", 2100, true, true, 0.95);
        if (cam9) Camera.getCameraDetails();

        boolean cam10 = Camera.createCamera("Nikon", "Z6 II", 180000, 24,
                "Black", "Mirrorless", 2000, true, true, 0.85);
        if (cam10) Camera.getCameraDetails();

        boolean cam11 = Camera.createCamera("Sony", "Alpha A7R V", 320000, 61,
                "Black", "Mirrorless", 2300, true, true, 0.88);
        if (cam11) Camera.getCameraDetails();

        boolean cam12 = Camera.createCamera("Panasonic", "Lumix S5", 150000, 24,
                "Black", "Mirrorless", 2100, true, true, 0.92);
        if (cam12) Camera.getCameraDetails();

        boolean cam13 = Camera.createCamera("Fujifilm", "XT-30", 75000, 26,
                "Silver", "Mirrorless", 1600, true, false, 0.68);
        if (cam13) Camera.getCameraDetails();

        boolean cam14 = Camera.createCamera("Olympus", "Tough TG-6", 40000, 12,
                "Red", "Compact", 1200, true, false, 0.25);
        if (cam14) Camera.getCameraDetails();

        boolean cam15 = Camera.createCamera("Canon", "PowerShot G7X", 65000, 20,
                "Black", "Compact", 1500, true, true, 0.45);
        if (cam15) Camera.getCameraDetails();
    }
}