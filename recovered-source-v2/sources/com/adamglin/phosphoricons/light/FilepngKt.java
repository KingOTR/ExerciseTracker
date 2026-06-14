package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Filepng.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FilePng", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFilePng", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_filePng", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilepngKt {
    private static ImageVector _filePng;

    public static final ImageVector getFilePng(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _filePng;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FilePng", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(60.0f, 146.0f);
        pathBuilder.lineTo(44.0f, 146.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(50.0f, 198.0f);
        pathBuilder.lineTo(60.0f, 198.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, -52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 186.0f);
        pathBuilder.lineTo(50.0f, 186.0f);
        pathBuilder.lineTo(50.0f, 158.0f);
        pathBuilder.lineTo(60.0f, 158.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 200.87f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.67f, 4.15f);
        pathBuilder.arcTo(28.06f, 28.06f, 0.0f, false, true, 200.0f, 214.0f);
        pathBuilder.curveToRelative(-16.54f, 0.0f, -30.0f, -15.25f, -30.0f, -34.0f);
        pathBuilder.reflectiveCurveToRelative(13.46f, -34.0f, 30.0f, -34.0f);
        pathBuilder.arcToRelative(27.43f, 27.43f, 0.0f, false, true, 15.36f, 4.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.72f, 9.95f);
        pathBuilder.arcTo(15.25f, 15.25f, 0.0f, false, false, 200.0f, 158.0f);
        pathBuilder.curveToRelative(-9.93f, 0.0f, -18.0f, 9.87f, -18.0f, 22.0f);
        pathBuilder.reflectiveCurveToRelative(8.07f, 22.0f, 18.0f, 22.0f);
        pathBuilder.arcToRelative(15.75f, 15.75f, 0.0f, false, false, 10.0f, -3.73f);
        pathBuilder.lineTo(210.0f, 190.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.0f, 152.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.17f, 5.71f);
        pathBuilder.arcTo(5.78f, 5.78f, 0.0f, false, true, 148.0f, 214.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.88f, -2.51f);
        pathBuilder.lineTo(114.0f, 170.72f);
        pathBuilder.lineTo(114.0f, 208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(102.0f, 152.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.88f, -3.49f);
        pathBuilder.lineTo(142.0f, 189.28f);
        pathBuilder.lineTo(142.0f, 152.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 118.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(54.0f, 40.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(90.0f);
        pathBuilder.lineTo(146.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(50.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(214.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.76f, -4.24f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 26.0f);
        pathBuilder.lineTo(56.0f, 26.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 48.0f, 118.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 46.48f);
        pathBuilder.lineTo(193.52f, 82.0f);
        pathBuilder.lineTo(158.0f, 82.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _filePng = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
