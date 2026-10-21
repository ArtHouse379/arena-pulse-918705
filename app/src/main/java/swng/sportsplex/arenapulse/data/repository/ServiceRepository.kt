package swng.sportsplex.arenapulse.data.repository

import swng.sportsplex.arenapulse.data.model.ServiceCategory
import swng.sportsplex.arenapulse.data.model.ServiceModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ServiceRepository {
    private val services: List<ServiceModel> = listOf(
        ServiceModel(
            id = 1,
            name = "Sports field mowing",
            description = "A grounds crew cuts the playing field to a consistent sport-appropriate height. Edges around goals, tracks, and barriers are trimmed for a clean finish. Clippings are cleared and the turf is checked for visible damage before handover.",
            serviceCategory = ServiceCategory.GROUNDS_TURF,
            pricePerHour = 52.00,
            imageUrl = "https://images.pexels.com/photos/40046993/pexels-photo-40046993.jpeg",
            includedItems = listOf("Field mowing", "Edge trimming", "Clipping removal", "Visual turf check"),
        ),
        ServiceModel(
            id = 2,
            name = "Pitch maintenance",
            description = "Technicians inspect the pitch and treat worn areas before they affect play. The visit can include aeration, light topdressing, and minor divot repair where conditions allow. A short condition note highlights irrigation issues or areas needing further attention.",
            serviceCategory = ServiceCategory.GROUNDS_TURF,
            pricePerHour = 64.00,
            imageUrl = "https://images.pexels.com/photos/30689708/pexels-photo-30689708.jpeg",
            includedItems = listOf("Pitch inspection", "Surface aeration", "Divot repair", "Condition notes"),
        ),
        ServiceModel(
            id = 3,
            name = "Basketball court resurfacing",
            description = "The court is assessed and prepared for a fresh, even playing surface. Small cracks and rough patches are repaired before the new coating is applied. The finished surface is checked for consistent coverage and safe traction.",
            serviceCategory = ServiceCategory.COURTS_SURFACES,
            pricePerHour = 78.00,
            imageUrl = "https://images.pexels.com/photos/12896161/pexels-photo-12896161.jpeg",
            includedItems = listOf("Surface assessment", "Minor crack repair", "Resurfacing coat", "Traction check"),
        ),
        ServiceModel(
            id = 4,
            name = "Track line marking",
            description = "Existing track markings are measured and refreshed for clear lane guidance. Faded sections are cleaned before durable marking paint is applied. Alignment and visibility are reviewed at the end of the service.",
            serviceCategory = ServiceCategory.COURTS_SURFACES,
            pricePerHour = 58.00,
            imageUrl = "https://images.pexels.com/photos/9565048/pexels-photo-9565048.jpeg",
            includedItems = listOf("Layout measurement", "Surface preparation", "Line painting", "Alignment review"),
        ),
        ServiceModel(
            id = 5,
            name = "Fitness equipment repair",
            description = "A technician diagnoses faults in commercial cardio or strength equipment. Loose hardware, worn components, and basic electrical connections are checked and repaired where possible. The machine is tested under light load and tagged with its service status.",
            serviceCategory = ServiceCategory.EQUIPMENT_REPAIR,
            pricePerHour = 72.00,
            imageUrl = "https://images.pexels.com/photos/6720526/pexels-photo-6720526.jpeg",
            includedItems = listOf("Fault diagnosis", "Hardware adjustment", "Minor parts fitting", "Function test"),
        ),
        ServiceModel(
            id = 6,
            name = "Scoreboard repair",
            description = "The scoreboard controls, display modules, and visible wiring are inspected for faults. Technicians correct accessible connection issues and replace minor serviceable components when supplied. A full display and control test confirms the system is ready for use.",
            serviceCategory = ServiceCategory.EQUIPMENT_REPAIR,
            pricePerHour = 86.00,
            imageUrl = "https://images.pexels.com/photos/34734503/pexels-photo-34734503.jpeg",
            includedItems = listOf("System diagnosis", "Connection repair", "Component fitting", "Display test"),
        ),
        ServiceModel(
            id = 7,
            name = "Swimming pool cleaning",
            description = "Pool surfaces and accessible edges are cleaned to remove routine debris and buildup. The water is skimmed, vacuumed, and visually checked for clarity. Basic readings are recorded so the facility team can manage any chemical adjustment separately.",
            serviceCategory = ServiceCategory.CLEANING_WATER,
            pricePerHour = 55.00,
            imageUrl = "https://images.pexels.com/photos/21327976/pexels-photo-21327976.jpeg",
            includedItems = listOf("Surface skimming", "Pool vacuuming", "Edge cleaning", "Basic water readings"),
        ),
        ServiceModel(
            id = 8,
            name = "Locker room cleaning",
            description = "High-contact surfaces, benches, floors, and accessible locker exteriors receive a focused deep clean. Suitable products are used across wet and dry zones to reduce residue and odours. The crew completes a final walkthrough and records any maintenance concerns.",
            serviceCategory = ServiceCategory.CLEANING_WATER,
            pricePerHour = 42.00,
            imageUrl = "https://images.pexels.com/photos/209271/pexels-photo-209271.jpeg",
            includedItems = listOf("Surface sanitising", "Floor cleaning", "Bench cleaning", "Final walkthrough"),
        ),
        ServiceModel(
            id = 9,
            name = "Arena lighting maintenance",
            description = "Accessible arena light fittings and controls are inspected for outages or visible damage. Safe minor adjustments and lamp replacements are completed using suitable access equipment. The lighting zones are then tested and unresolved electrical faults are documented.",
            serviceCategory = ServiceCategory.SAFETY_SYSTEMS,
            pricePerHour = 82.00,
            imageUrl = "https://images.pexels.com/photos/35049383/pexels-photo-35049383.jpeg",
            includedItems = listOf("Lighting inspection", "Minor adjustments", "Lamp replacement", "Zone testing"),
        ),
        ServiceModel(
            id = 10,
            name = "Facility safety inspection",
            description = "An inspector walks public, staff, and activity areas using a structured facility checklist. Exits, barriers, signs, and common trip hazards are reviewed and photographed where needed. The visit ends with a concise action list ranked by urgency.",
            serviceCategory = ServiceCategory.SAFETY_SYSTEMS,
            pricePerHour = 68.00,
            imageUrl = "https://images.pexels.com/photos/8293680/pexels-photo-8293680.jpeg",
            includedItems = listOf("Site walkthrough", "Hazard review", "Photo notes", "Priority action list"),
        ),
    )

    fun observeAll(): Flow<List<ServiceModel>> {
        return flowOf(services)
    }

    fun observeById(id: Int): Flow<ServiceModel?> {
        val service = services.firstOrNull { service -> service.id == id }
        return flowOf(service)
    }

    fun getById(id: Int): ServiceModel? {
        return services.firstOrNull { service -> service.id == id }
    }
}
