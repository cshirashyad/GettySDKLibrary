package com.shirashyad.gettysdk.search;

import com.shirashyad.gettysdk.SdkException;

public interface ICreativeImagesSearch {
    String ExecuteAsync() throws SdkException;

    ICreativeImagesSearch WithPage(int val);

    ICreativeImagesSearch WithPageSize(int val);

    ICreativeImagesSearch WithPhrase(String val);

    ICreativeImagesSearch WithSortOrder(String val);

    ICreativeImagesSearch WithEmbedContentOnly(boolean val);

    ICreativeImagesSearch WithExcludeNudity(boolean val);

    ICreativeImagesSearch WithResponseField(String val);

    ICreativeImagesSearch WithGraphicalStyle(GraphicalStyles val);

    ICreativeImagesSearch WithOrientation(Orientation val);

    ICreativeImagesSearch WithLicenseModel(LicenseModel val);

    ICreativeImagesSearch Creative();

    IEditorialImagesSearch Editorial();
}
