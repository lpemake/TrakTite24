def main():
    # Dictionary to store provinces and their total area
    provinces = {}
    
    try:
        with open('kunnat.txt', 'r', encoding='utf-8') as file:
            for line in file:
                line = line.strip()
                if line:  # Skip empty lines
                    parts = line.split('\t')
                    if len(parts) >= 2:
                        municipality = parts[1].strip()
                        province = parts[2].strip()
                        area = float(parts[4].strip())
                        
                        # Add area to province
                        if province in provinces:
                            provinces[province] += area
                        else:
                            provinces[province] = area
        
        # Print results
        print("Maakuntien pinta-alat:")
        print("-" * 40)
        for province in sorted(provinces.keys()):
            print(f"{province}: {provinces[province]:.2f} km²")
    
    except FileNotFoundError:
        print("Tiedostoa kunnat.txt ei löydy.")
    except Exception as e:
        print(f"Virhe: {e}")

if __name__ == "__main__":
    main()