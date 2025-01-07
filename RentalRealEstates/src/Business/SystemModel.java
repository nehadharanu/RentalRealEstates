/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Builder.BuilderDirectory;
import Business.Builder.ListingsDirectory;
import Business.HomeEssentials.HomeEssentialsDirectory;
import Business.PointOfContact.Medical.AmbulanceDirectory;
import Business.PointOfContact.SecurityService.SecurityServiceDirectory;
import Business.PointOfContact.Utility.UtilityServiceDirectory;
import Business.RealEstateAgency.RealEstateAgentDirectory;
import Business.User.UserDirectory;
import Business.RealEstateAgency.RealEstateAgentDirectory;
import Business.PropertyDevelopmenntBoard.InquiryFormDirectory;
import Business.Surveyor.SurveyorDirectory;
import Business.UserAccountManagement.UserAccountDirectory;
import Business.WorkQueue.DonateProductDirectory;
import Business.WorkQueue.EmergencyRequestDirectory;
import Business.WorkQueue.ListingRequestDirectory;
import Business.WorkQueue.RealEstateAgentAppointmentDirectory;
import Business.WorkQueue.RequestHomeEssentialsDirectory;
import Business.WorkQueue.SearchApplication;

/**
 *
 * @author rajesh
 */
public class SystemModel {

    private UserAccountDirectory userAccDirectory;
    private ListingsDirectory listingsDirectory;
    private RealEstateAgentDirectory realEstateAgentDirectory;
    private RealEstateAgentAppointmentDirectory realEstateAgentAppointmentDir;
    private SearchApplication checkApplication;
    private AmbulanceDirectory ambulanceDirectory;
    private SecurityServiceDirectory securityServiceDirectory;
    private ListingRequestDirectory listingRequestDirectory;
    private UtilityServiceDirectory utilityServiceDirectory;
    private EmergencyRequestDirectory emergencyRequestDirectory;
    private BuilderDirectory builderDirectory;
    private HomeEssentialsDirectory homeEssentialsDirectory;
    private UserDirectory userDirectory;
    private RequestHomeEssentialsDirectory requestHomeEssentialsDirectory;
    private InquiryFormDirectory inquiryFormDirectory;
    private DonateProductDirectory donateProdirectory;
    private SurveyorDirectory surveyorDirectory;

    public SystemModel() {
        userAccDirectory = new UserAccountDirectory();
        listingsDirectory = new ListingsDirectory();
        realEstateAgentDirectory = new RealEstateAgentDirectory();
        builderDirectory = new BuilderDirectory();
        checkApplication = new SearchApplication();
        ambulanceDirectory = new AmbulanceDirectory();
        securityServiceDirectory = new SecurityServiceDirectory();
        utilityServiceDirectory = new UtilityServiceDirectory();
        emergencyRequestDirectory = new EmergencyRequestDirectory();
        listingRequestDirectory = new ListingRequestDirectory();
        userDirectory = new UserDirectory();
        homeEssentialsDirectory = new HomeEssentialsDirectory();
        requestHomeEssentialsDirectory = new RequestHomeEssentialsDirectory();
        inquiryFormDirectory = new InquiryFormDirectory();
        donateProdirectory = new DonateProductDirectory();
        surveyorDirectory = new SurveyorDirectory();
    }

    public UserAccountDirectory getUserAccDirectory() {
        if (userAccDirectory == null) {
            userAccDirectory = new UserAccountDirectory();
        }
        return userAccDirectory;

    }

    public RealEstateAgentAppointmentDirectory getRealEstateAgentAppointmentDir() {
        if (realEstateAgentAppointmentDir == null) {
            realEstateAgentAppointmentDir = new RealEstateAgentAppointmentDirectory();
        }
        return realEstateAgentAppointmentDir;
    }

    public void setRealEstateAgentAppointmentDir(RealEstateAgentAppointmentDirectory realEstateAgentAppointmentDir) {
        this.realEstateAgentAppointmentDir = realEstateAgentAppointmentDir;
    }

    public SearchApplication getCheckApplication() {
        if (checkApplication == null) {
            checkApplication = new SearchApplication();
        }
        return checkApplication;
    }

    public void setCheckApplication(SearchApplication checkApplication) {
        this.checkApplication = checkApplication;
    }

    public ListingRequestDirectory getListingRequestDirectory() {
        if (listingRequestDirectory == null) {
            listingRequestDirectory = new ListingRequestDirectory();
        }
        return listingRequestDirectory;
    }

    public void setListingRequestDirectory(ListingRequestDirectory listingRequestDirectory) {
        this.listingRequestDirectory = listingRequestDirectory;
    }

    public BuilderDirectory getBuilderDirectory() {
        if (builderDirectory == null) {
            builderDirectory = new BuilderDirectory();
        }
        return builderDirectory;
    }

    public void setBuilderDirectory(BuilderDirectory builderDirectory) {
        this.builderDirectory = builderDirectory;
    }

    public HomeEssentialsDirectory getHomeEssentialsDirectory() {
        if (homeEssentialsDirectory == null) {
            homeEssentialsDirectory = new HomeEssentialsDirectory();
        }
        return homeEssentialsDirectory;
    }

    public void setHomeEssentialsDirectory(HomeEssentialsDirectory homeEssentialsDirectory) {
        this.homeEssentialsDirectory = homeEssentialsDirectory;
    }

    public RequestHomeEssentialsDirectory getRequestHomeEssentialDirectory() {
        if (requestHomeEssentialsDirectory == null) {
            requestHomeEssentialsDirectory = new RequestHomeEssentialsDirectory();
        }
        return requestHomeEssentialsDirectory;
    }

    public void setRequestHomeEssentialsDirectory(RequestHomeEssentialsDirectory requestMarketPlaceDirectory) {
        this.requestHomeEssentialsDirectory = requestMarketPlaceDirectory;
    }

    public UserDirectory getUserDirectory() {
        if (userDirectory == null) {
            userDirectory = new UserDirectory();
        }
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }
    
    public RealEstateAgentDirectory getRealEstateAgentDirectory() {
        if(realEstateAgentDirectory == null) {
            realEstateAgentDirectory = new RealEstateAgentDirectory();
        }
        return realEstateAgentDirectory;
    }

    public void setRealEstateAgentDirectory(RealEstateAgentDirectory realEstateAgent) {
        this.realEstateAgentDirectory = realEstateAgent;
    }


    public ListingsDirectory getListingsDirectory() {
        if (listingsDirectory == null) {
            listingsDirectory = new ListingsDirectory();
        }
        return listingsDirectory;
    }

    public void setListingsDirectory(ListingsDirectory listingsDirectory) {
        this.listingsDirectory = listingsDirectory;

    }
    
    public InquiryFormDirectory getInquiryFormDirectory() {
        if (inquiryFormDirectory == null) {
            inquiryFormDirectory = new InquiryFormDirectory();

        }
        return inquiryFormDirectory;
    }

    public void setInquiryFormDirectory(InquiryFormDirectory inquiryFormDirectory) {
        this.inquiryFormDirectory = inquiryFormDirectory;
    }

    public DonateProductDirectory getDonateProdirectory() {
        if (donateProdirectory == null) {
            donateProdirectory = new DonateProductDirectory();
        }
        return donateProdirectory;
    }

    public void setDonateProdirectory(DonateProductDirectory donateProdirectory) {
        this.donateProdirectory = donateProdirectory;
    }
    
    public EmergencyRequestDirectory getEmergencyRequestDirectory() {
        if(emergencyRequestDirectory == null) {
            emergencyRequestDirectory = new EmergencyRequestDirectory();
        }
        return emergencyRequestDirectory;
    }

    public void setEmergencyRequestDirectory(EmergencyRequestDirectory emergencyRequestDirectory) {
        this.emergencyRequestDirectory = emergencyRequestDirectory;
    }
    
    public AmbulanceDirectory getAmbulanceDirectory() {
        if(ambulanceDirectory == null) {
            ambulanceDirectory = new AmbulanceDirectory();
        }
        return ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }
    
    public UtilityServiceDirectory getUtilityServiceDirectory() {
        if(utilityServiceDirectory == null) {
            utilityServiceDirectory = new UtilityServiceDirectory();
        }
        return utilityServiceDirectory;
    }

    public void setUtilityServiceDirectory(UtilityServiceDirectory maintenanceDirectory) {
        this.utilityServiceDirectory = maintenanceDirectory;
    }
    
    public SecurityServiceDirectory getSecurityServiceDirectory() {
        if(securityServiceDirectory == null) {
            securityServiceDirectory = new SecurityServiceDirectory();
        }
        return securityServiceDirectory;
    }

    public void setSecurityServiceDirectory(SecurityServiceDirectory securityServiceDirectory) {
        this.securityServiceDirectory = securityServiceDirectory;
    }
    
    public SurveyorDirectory getSurveyorDirectory() {
        if(surveyorDirectory == null){
            surveyorDirectory = new SurveyorDirectory();   
        }
        return surveyorDirectory;
    }

    public void setSurveyorDirectory(SurveyorDirectory surveyorDirectory) {
        this.surveyorDirectory = surveyorDirectory;
    }
    
}