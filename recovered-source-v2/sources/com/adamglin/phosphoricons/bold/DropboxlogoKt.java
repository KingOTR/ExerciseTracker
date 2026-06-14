package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dropboxlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropboxLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getDropboxLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropboxLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropboxlogoKt {
    private static ImageVector _dropboxLogo;

    public static final ImageVector getDropboxLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _dropboxLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DropboxLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(238.83f, 146.13f);
        pathBuilder.lineTo(201.08f, 120.0f);
        pathBuilder.lineToRelative(37.75f, -26.13f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -19.74f);
        pathBuilder.lineToRelative(-52.0f, -36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.66f, 0.0f);
        pathBuilder.lineTo(128.0f, 69.41f);
        pathBuilder.lineTo(82.83f, 38.13f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.66f, 0.0f);
        pathBuilder.lineToRelative(-52.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 19.74f);
        pathBuilder.lineTo(54.92f, 120.0f);
        pathBuilder.lineTo(17.17f, 146.13f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 19.74f);
        pathBuilder.lineToRelative(52.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.66f, 0.0f);
        pathBuilder.lineTo(128.0f, 170.59f);
        pathBuilder.lineToRelative(45.17f, 31.28f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.66f, 0.0f);
        pathBuilder.lineToRelative(52.0f, -36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -19.74f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 141.41f);
        pathBuilder.lineTo(97.08f, 120.0f);
        pathBuilder.lineTo(128.0f, 98.59f);
        pathBuilder.lineTo(158.92f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 62.6f);
        pathBuilder.lineTo(210.92f, 84.0f);
        pathBuilder.lineTo(180.0f, 105.4f);
        pathBuilder.lineTo(149.08f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 62.6f);
        pathBuilder.lineTo(106.92f, 84.0f);
        pathBuilder.lineTo(76.0f, 105.4f);
        pathBuilder.lineTo(45.08f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 177.4f);
        pathBuilder.lineTo(45.08f, 156.0f);
        pathBuilder.lineTo(76.0f, 134.6f);
        pathBuilder.lineTo(106.92f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 177.4f);
        pathBuilder.lineTo(149.08f, 156.0f);
        pathBuilder.lineTo(180.0f, 134.6f);
        pathBuilder.lineTo(210.92f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.73f, 209.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.0f, 16.7f);
        pathBuilder.lineToRelative(-16.86f, 11.68f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -13.66f, 0.0f);
        pathBuilder.lineToRelative(-16.86f, -11.68f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 118.0f, 206.46f);
        pathBuilder.lineToRelative(10.0f, 6.94f);
        pathBuilder.lineToRelative(10.0f, -6.94f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 154.73f, 209.49f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropboxLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
